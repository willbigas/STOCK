package br.com.bwstock.daoimpl;

import br.com.bwstock.SessionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import br.com.bwstock.dao.ProdutoDao;
import br.com.bwstock.entidade.EstoqueMovimento;
import br.com.bwstock.entidade.Produto;
import java.sql.Date;

public class ProdutoDaoImpl implements ProdutoDao {

    private Connection conexao;

    @Override
    public boolean inserir(Object obj) throws Exception {
        Produto produto = (Produto) obj;
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement("INSERT INTO PRODUTO (SKU , NOME , EAN13 , QTDESTOQUE , "
                    + "ID_ESTOQUEMOVIMENTO , DATACADASTRO , ATUALIZADO) VALUES (? , ? , ?)", Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, produto.getSku());
            statement.setString(2, produto.getNome());
            statement.setInt(3, produto.getEan13());
            statement.setInt(4, produto.getQtdEstoque());
            statement.setInt(5, produto.getMovEstoque().getId());
            statement.setDate(6, new Date(produto.getDataCadastro().getTime()));
            statement.setTimestamp(7, new Timestamp(System.currentTimeMillis()));
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                Integer idInserido = rs.getInt(1);
                produto.setId(idInserido);
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.close();
        }
        return false;
    }

    @Override
    public boolean update(Object obj) throws Exception {
        Produto produto = (Produto) obj;
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement(
                    "UPDATE TIPOARQUIVO SET SKU = ? , NOME = ? , EAN13 = ? , "
                    + "QTESTOQUE = ? , ID_ESTOQUEMOVIMENTO = ? , DATACADASTRO = ? , ATUALIZADO = ?  WHERE ID = ? ");
            statement.setString(1, produto.getSku());
            statement.setString(2, produto.getNome());
            statement.setInt(3, produto.getEan13());
            statement.setInt(4, produto.getQtdEstoque());
            statement.setInt(5, produto.getMovEstoque().getId());
            statement.setDate(6, new Date(produto.getDataCadastro().getTime()));
            statement.setTimestamp(7, new Timestamp(System.currentTimeMillis()));
            statement.setInt(8, produto.getId());
            int linhasAtualizadas = statement.executeUpdate();
            return linhasAtualizadas > 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.close();
        }
        return false;
    }

    @Override
    public Produto pesquisar(Integer id) throws Exception {
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement(
                    "SELECT * FROM PRODUTO WHERE ID = ? ");
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String sku = rs.getString("sku");
                String nome = rs.getString("nome");
                Integer ean13 = rs.getInt("ean13");
                Integer qtdEstoque = rs.getInt("qtdEstoque");
                Integer estoqueMovimentoId = rs.getInt("id_EstoqueMovimento");
                Date dataCadastro = rs.getDate("dataCadastro");
                Timestamp ts = rs.getTimestamp("atualizado");
                Produto p = new Produto();
                p.setId(id);
                p.setSku(sku);
                p.setNome(nome);
                p.setEan13(ean13);
                p.setQtdEstoque(qtdEstoque);
//                p.setMovEstoque(estoqueMovimentoId); // pesquisar estoque movimento , arrumar.
                p.setDataCadastro(dataCadastro);
                p.setAtualizado(ts);
                return p;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.close();
        }
        return null;
    }

    @Override
    public List<Object> pesquisarTodos() throws Exception {
        List<Object> produtos = new ArrayList<>();
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement(
                    "SELECT * FROM PRODUTO");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Produto p = new Produto();
                p.setSku(rs.getString("sku"));
                p.setNome(rs.getString("nome"));
                p.setEan13(rs.getInt("ean13"));
                p.setQtdEstoque(rs.getInt("qtdEstoque"));
//                p.setMovEstoque(rs.getInt("id_MovimentoEstoque")); // verificar , acho que tem buscar via pesquisa do estoque movimento\
                p.setDataCadastro(rs.getDate("dataCadastro"));
                p.setAtualizado(rs.getTimestamp("atualizado"));
                p.setId(rs.getInt("id"));
                produtos.add(p);
            }
            return produtos;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.close();
        }
        return produtos;
    }

    @Override
    public boolean excluir(Integer id) throws Exception {
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement(
                    "DELETE FROM PRODUTO WHERE ID = ? ");
            statement.setInt(1, id);
            int executeUpdate = statement.executeUpdate();
            return executeUpdate != 0;
        } catch (Exception e) {
            return false;
        } finally {
            conexao.close();
        }
    }

}

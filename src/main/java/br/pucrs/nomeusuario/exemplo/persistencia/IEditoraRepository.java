package br.pucrs.nomeusuario.exemplo.persistencia;

import java.util.List;

public interface IEditoraRepository {
    List<Editora> findAll();
    Editora findById(long id);
}

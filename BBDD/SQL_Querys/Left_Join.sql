SELECT P1.nombre,A1.nombre,A1.id,A1.direccion,A1.descripcion,A1.precio 
FROM provincias P1
LEFT JOIN (SElECT P.nombre AS p_nombre,M.nombre,A.* FROM provincias AS P,municipios AS M,anuncios AS A WHERE P.id=M.fk_provincias AND M.id=A.fk_municipios) AS A1 ON A1.p_nombre=P1.nombre ORDER BY A1.nombre
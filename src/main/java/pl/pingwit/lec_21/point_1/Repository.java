package pl.pingwit.lec_21.point_1;

/**
 * @author Pavel Radkevich
 * @since 5.04.23
 */
public interface Repository<T, E> {

    // CRUD - create read update delete
    T create(T o);

    T read(E id);

}

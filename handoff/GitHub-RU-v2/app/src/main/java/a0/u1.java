package a0;

/* loaded from: /home/user/work/p/classes.dex */
public interface u1 {
    Object a();

    default boolean b(Object obj, Object obj2) {
        return obj.equals(a()) && obj2.equals(c());
    }

    Object c();
}

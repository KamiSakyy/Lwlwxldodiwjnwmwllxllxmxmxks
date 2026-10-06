package kotlinx.serialization.descriptors;

import java.util.List;
import x61.r;
import y9.a;

/* loaded from: /home/user/work/p/classes5.dex */
public interface SerialDescriptor {
    String a();

    default boolean c() {
        return false;
    }

    int d(String str);

    a e();

    int f();

    String g(int i);

    default List getAnnotations() {
        return r.r;
    }

    default boolean h() {
        return false;
    }

    List i(int i);

    SerialDescriptor j(int i);

    boolean k(int i);








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class a {
        public a() {
        }
    }
}

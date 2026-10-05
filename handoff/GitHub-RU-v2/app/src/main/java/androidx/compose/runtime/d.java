package androidx.compose.runtime;

/* loaded from: /home/user/work/p/classes.dex */
public interface d {
    void a(int i, Object obj);

    void b(Object obj);

    default void c() {
        Object k10 = k();
        l lVar = k10 instanceof l ? (l) k10 : null;
        if (lVar != null) {
            lVar.i();
        }
    }

    default void d(j71.e eVar, Object obj) {
        eVar.s(k(), obj);
    }

    void e(int i, int i10, int i11);

    void f(int i, int i10);

    void h();

    void i(int i, Object obj);

    default void j() {
    }

    Object k();
}

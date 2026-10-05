package z5;

/* loaded from: /home/user/work/p/classes.dex */
public interface n {
    Object a(j71.e eVar, Object obj);

    boolean b(a7.i iVar);

    boolean c(j71.c cVar);

    default n d(n nVar) {
        return nVar == l.f34585a ? this : new e(this, nVar);
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class e<T1,T2,T3,T4> {
        public e() {
        }
    }
}

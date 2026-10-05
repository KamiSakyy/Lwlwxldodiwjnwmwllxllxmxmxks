package z5;

/* loaded from: /home/user/work/p/classes.dex */
public interface m extends n {
    @Override // z5.n
    default Object a(j71.e eVar, Object obj) {
        return eVar.s(obj, this);
    }

    @Override // z5.n
    default boolean b(a7.i iVar) {
        return ((Boolean) iVar.k(this)).booleanValue();
    }

    @Override // z5.n
    default boolean c(j71.c cVar) {
        return ((Boolean) cVar.k(this)).booleanValue();
    }
}

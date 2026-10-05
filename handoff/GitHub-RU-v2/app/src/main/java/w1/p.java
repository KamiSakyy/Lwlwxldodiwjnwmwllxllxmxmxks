package w1;

/* loaded from: /home/user/work/p/classes.dex */
public interface p extends r {
    @Override // w1.r
    default Object a(j71.e eVar, Object obj) {
        return eVar.s(obj, this);
    }

    @Override // w1.r
    default boolean b(j71.c cVar) {
        return ((Boolean) cVar.k(this)).booleanValue();
    }
}

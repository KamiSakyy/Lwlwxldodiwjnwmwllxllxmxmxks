package c71;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h extends a {
    public h(a71.c cVar) {
        super(cVar);
        if (cVar != null && cVar.q() != a71.i.r) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // a71.c
    public final a71.h q() {
        return a71.i.r;
    }
}

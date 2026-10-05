package y71;

/* loaded from: /home/user/work/p/classes5.dex */
public final class c extends e {
    public final c71.j w;

    public c(j71.e eVar, a71.h hVar, int i, x71.a aVar) {
        super(eVar, hVar, i, aVar);
        this.w = (c71.j) eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // y71.e, z71.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(x71.t tVar, a71.c cVar) {
        b bVar;
        int i;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i2 = bVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.x = i2 - Integer.MIN_VALUE;
                Object obj = bVar.v;
                b71.a aVar = b71.a.r;
                i = bVar.x;
                if (i != 0) {
                    sy.y.j(obj);
                    bVar.u = tVar;
                    bVar.x = 1;
                    if (super.d(tVar, bVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tVar = bVar.u;
                    sy.y.j(obj);
                }
                if (((x71.s) tVar).u.z()) {
                    throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                }
                return w61.a0.a;
            }
        }
        bVar = new b(this, (c71.c) cVar);
        Object obj2 = bVar.v;
        b71.a aVar2 = b71.a.r;
        i = bVar.x;
        if (i != 0) {
        }
        if (((x71.s) tVar).u.z()) {
        }
    }

    @Override // y71.e, z71.d
    public final z71.d e(a71.h hVar, int i, x71.a aVar) {
        return new c(this.w, hVar, i, aVar);
    }
}

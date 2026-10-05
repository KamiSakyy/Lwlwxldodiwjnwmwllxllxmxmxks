package com.github.rudroid.favorites.viewmodels;

/* loaded from: /home/user/work/p/classes.dex */
public final class v<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f12394r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o f12395s;

    public v(y71.j jVar, o oVar) {
        this.f12394r = jVar;
        this.f12395s = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        u uVar;
        int i;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i10 = uVar.f12392v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                uVar.f12392v = i10 - Integer.MIN_VALUE;
                Object obj2 = uVar.f12391u;
                b71.a aVar = b71.a.r;
                i = uVar.f12392v;
                if (i != 0) {
                    sy.y.j(obj2);
                    if (this.f12395s.f12381z) {
                        uVar.f12392v = 1;
                        if (this.f12394r.c(obj, uVar) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj2);
                }
                return w61.a0.a;
            }
        }
        uVar = new u(this, cVar);
        Object obj22 = uVar.f12391u;
        b71.a aVar2 = b71.a.r;
        i = uVar.f12392v;
        if (i != 0) {
        }
        return w61.a0.a;
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class o<T1,T2,T3,T4> {
        public o() {
        }
    }
}

package com.github.rudroid.factories.actions;

import java.io.File;
import sy.y;
import w61.a0;
import y71.j;

/* loaded from: /home/user/work/p/classes.dex */
public class b<T> implements j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f12286r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f12287s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f12288t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f12289u;

    public b(j jVar, e eVar, String str, int i) {
        this.f12286r = jVar;
        this.f12287s = eVar;
        this.f12288t = str;
        this.f12289u = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        a aVar;
        int i;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i10 = aVar.f12284v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f12284v = i10 - Integer.MIN_VALUE;
                Object obj2 = aVar.f12283u;
                b71.a aVar2 = b71.a.r;
                i = aVar.f12284v;
                if (i != 0) {
                    y.j(obj2);
                    File file = new File((File) obj, e.a(this.f12287s, this.f12288t, this.f12289u));
                    aVar.f12284v = 1;
                    if (this.f12286r.c(file, aVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj2);
                }
                return a0.a;
            }
        }
        aVar = new a(this, cVar);
        Object obj22 = aVar.f12283u;
        b71.a aVar22 = b71.a.r;
        i = aVar.f12284v;
        if (i != 0) {
        }
        return a0.a;
    }
}

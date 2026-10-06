package fj;

import bz0.e;
import com.github.domain.database.GitHubDatabase;
import com.google.android.gms.internal.measurement.d5;
import d9.m;
import k71.k;
import oa.j;
import sy.y;
import y71.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public d a;

    public c(d dVar) {
        k.g(dVar, "store");
        this.a = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(j jVar, String str, c71.c cVar) {
        b bVar;
        int i;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i2 = bVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.w = i2 - Integer.MIN_VALUE;
                Object obj = bVar.u;
                Object obj2 = b71.a.r;
                i = bVar.w;
                if (i != 0) {
                    y.j(obj);
                    bVar.w = 1;
                    dk.d dVar = (dk.d) ((GitHubDatabase) this.a.a.a(jVar)).E();
                    dVar.getClass();
                    k.g(str, "repoOwnerAndName");
                    obj = d5.B(dVar.a, new String[]{"repository_code_searches"}, new m(str, 14));
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return new e((i) obj, 21);
            }
        }
        bVar = new b(this, cVar);
        Object obj3 = bVar.u;
        Object obj22 = b71.a.r;
        i = bVar.w;
        if (i != 0) {
        }
        return new e((i) obj3, 21);
    }

}

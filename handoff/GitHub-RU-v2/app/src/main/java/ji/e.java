package ji;

import android.content.SharedPreferences;
import androidx.compose.foundation.lazy.layout.t1;
import com.github.service.models.ApiFailure;
import com.github.service.models.ApiRequestStatus;
import java.util.Iterator;
import java.util.Objects;
import k71.k;
import oa.j;
import oa.m;
import q81.u;
import sy.y;
import w61.a0;
import z01.x;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public final m a;
    public final x b;

    public e(m mVar, x xVar) {
        k.g(mVar, "userManager");
        k.g(xVar, "oAuthService");
        this.a = mVar;
        this.b = xVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        if (r12 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(c71.c cVar) {
        d dVar;
        int i;
        Iterator it;
        int i2;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i3 = dVar.z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dVar.z = i3 - Integer.MIN_VALUE;
                Object obj = dVar.x;
                b71.a aVar = b71.a.r;
                i = dVar.z;
                if (i != 0) {
                    y.j(obj);
                    it = this.a.e().iterator();
                    i2 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = dVar.w;
                    j jVar = dVar.v;
                    it = dVar.u;
                    y.j(obj);
                    xz0.c cVar2 = (xz0.c) obj;
                    k.g(cVar2, "<this>");
                    boolean z = cVar2.a != ApiRequestStatus.SUCCESS;
                    Object obj2 = cVar2.b;
                    if (z) {
                        String str = (String) obj2;
                        if (str == null) {
                            str = "";
                        }
                        jVar.getClass();
                        t1 t1Var = jVar.g;
                        r71.e eVar = j.p[3];
                        t1Var.getClass();
                        k.g(eVar, "property");
                        t1Var.c = str;
                        t1Var.d = k41.b.i(str);
                        t1Var.a = true;
                        SharedPreferences.Editor edit = ((SharedPreferences) t1Var.b).edit();
                        k.c(edit, "editor");
                        edit.putString("enterprise_version", str);
                        edit.apply();
                        Objects.toString(obj2);
                    } else {
                        String str2 = jVar.c;
                        ApiFailure apiFailure = cVar2.c;
                        if (apiFailure != null) {
                            apiFailure.getMessage();
                        }
                    }
                    if (it.hasNext()) {
                        jVar = (j) it.next();
                        dVar.u = it;
                        dVar.v = jVar;
                        dVar.w = i2;
                        dVar.z = 1;
                        x xVar = this.b;
                        xVar.getClass();
                        if (jVar.o) {
                            obj = i21.a.s((u) xVar.b.a(jVar), new x01.d(jVar), dVar);
                            if (obj == aVar) {
                                return aVar;
                            }
                        } else {
                            xz0.c.Companion.getClass();
                            obj = xz0.b.b("");
                        }
                        xz0.c cVar22 = (xz0.c) obj;
                        k.g(cVar22, "<this>");
                        if (cVar22.a != ApiRequestStatus.SUCCESS) {
                        }
                        Object obj22 = cVar22.b;
                        if (z) {
                        }
                        if (it.hasNext()) {
                            return a0.a;
                        }
                    }
                }
            }
        }
        dVar = new d(this, cVar);
        Object obj3 = dVar.x;
        b71.a aVar2 = b71.a.r;
        i = dVar.z;
        if (i != 0) {
        }
    }

}

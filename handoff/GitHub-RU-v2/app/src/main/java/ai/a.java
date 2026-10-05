package ai;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.foundation.lazy.layout.t1;
import com.github.centrallogger.CentralUsageWorker;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import k71.k;
import oa.j;
import r71.e;
import v8.a0;
import v8.d0;
import v8.n;
import v8.z;
import w8.q;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public final /* synthetic */ int a;

    public final void a(Context context, j jVar) {
        switch (this.a) {
            case 0:
                k.g(jVar, "user");
                CentralUsageWorker.Companion.getClass();
                z d = new z(CentralUsageWorker.class).e(CentralUsageWorker.i).d(v8.a.r, 10000L, TimeUnit.MILLISECONDS);
                pa.c cVar = jVar.k;
                e[] eVarArr = j.p;
                e eVar = eVarArr[7];
                SharedPreferences sharedPreferences = cVar.b;
                k.g(eVar, "property");
                if (!cVar.c) {
                    if (!sharedPreferences.contains("device_user_guid")) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        k.c(edit, "editor");
                        edit.putString("device_user_guid", UUID.randomUUID().toString());
                        edit.apply();
                    }
                    String string = sharedPreferences.getString("device_user_guid", "");
                    if (string == null) {
                        string = "";
                    }
                    cVar.d = string;
                    cVar.c = true;
                }
                w61.k kVar = new w61.k("device_user_guid", cVar.d);
                t1 t1Var = jVar.g;
                e eVar2 = eVarArr[3];
                t1Var.getClass();
                k.g(eVar2, "property");
                if (!t1Var.a) {
                    String string2 = ((SharedPreferences) t1Var.b).getString("enterprise_version", "");
                    String str = string2 != null ? string2 : "";
                    t1Var.c = str;
                    t1Var.d = k41.b.i(str);
                    t1Var.a = true;
                }
                w61.k[] kVarArr = {kVar, new w61.k("enterprise_server_version", k41.b.I((String) t1Var.c))};
                d0 d0Var = new d0();
                for (int i = 0; i < 2; i++) {
                    w61.k kVar2 = kVarArr[i];
                    d0Var.b(kVar2.s, (String) kVar2.r);
                }
                a0 a = d.g(d0Var.a()).a();
                q Z = q.Z(context);
                k.f(Z, "getInstance(...)");
                Z.s("CentralUsageWorker", n.r, a);
                break;
            default:
                k.g(jVar, "user");
                break;
        }
    }
}

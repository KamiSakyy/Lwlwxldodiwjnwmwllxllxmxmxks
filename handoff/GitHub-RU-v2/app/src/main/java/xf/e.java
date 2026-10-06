package xf;

import android.content.SharedPreferences;
import java.util.ArrayList;
import k71.k;
import oa.j;
import oa.m;
import t71.p;
import xf.a;

/* loaded from: /home/user/work/p/classes3.dex */
public class e implements a.InterfaceC0031a {
    public m a;

    public e(m mVar) {
        k.g(mVar, "userManager");
        this.a = mVar;
    }

    @Override // xf.a.InterfaceC0031a
    public final void a() {
        ArrayList e = this.a.e();
        int size = e.size();
        int i = 0;
        while (i < size) {
            Object obj = e.get(i);
            i++;
            j jVar = (j) obj;
            pa.c cVar = jVar.e;
            pa.c cVar2 = jVar.e;
            r71.e[] eVarArr = j.p;
            if (!p.I(cVar.a(jVar, eVarArr[1]), "workflow", false)) {
                String str = cVar2.a(jVar, eVarArr[1]) + " workflow";
                k.g(str, "<set-?>");
                r71.e eVar = eVarArr[1];
                cVar2.getClass();
                k.g(eVar, "property");
                cVar2.d = str;
                cVar2.c = true;
                SharedPreferences.Editor edit = cVar2.b.edit();
                k.c(edit, "editor");
                edit.putString("approved_oauth_scope", str);
                edit.apply();
            }
        }
    }
}

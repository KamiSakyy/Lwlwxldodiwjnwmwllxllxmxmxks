package dn;

import android.content.SharedPreferences;
import com.google.android.gms.internal.measurement.h4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import yz0.c8;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d0 implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ oa.j s;

    public /* synthetic */ d0(oa.j jVar, int i) {
        this.r = i;
        this.s = jVar;
    }

    public final Object c(Object obj, a71.c cVar) {
        switch (this.r) {
            case 0:
                this.s.i(((f11.d) obj).a.toInstant().toEpochMilli());
                break;
            case 1:
                this.s.h(((f11.d) obj).a.toInstant().toEpochMilli());
                break;
            case 2:
                Set set = (Set) obj;
                oa.j jVar = this.s;
                String str = jVar.c;
                k71.k.g(set, "<set-?>");
                h4 h4Var = jVar.f;
                r71.e eVar = oa.j.p[2];
                h4Var.getClass();
                k71.k.g(eVar, "property");
                h4Var.c = set;
                h4Var.a = true;
                SharedPreferences.Editor edit = ((SharedPreferences) h4Var.b).edit();
                k71.k.c(edit, "editor");
                Set set2 = set;
                ArrayList arrayList = new ArrayList(x61.n.F(set2, 10));
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.github.rudroid.common.a) it.next()).name());
                }
                edit.putStringSet("capabilities", x61.m.K0(arrayList));
                edit.apply();
                break;
            default:
                c8 c8Var = (c8) obj;
                String str2 = c8Var.b.r;
                oa.j jVar2 = this.s;
                pa.c cVar2 = jVar2.l;
                r71.e[] eVarArr = oa.j.p;
                r71.e eVar2 = eVarArr[8];
                cVar2.getClass();
                k71.k.g(eVar2, "property");
                cVar2.d = str2;
                cVar2.c = true;
                SharedPreferences.Editor edit2 = cVar2.b.edit();
                k71.k.c(edit2, "editor");
                edit2.putString("user_avatar", str2);
                edit2.apply();
                String str3 = c8Var.c;
                pa.c cVar3 = jVar2.d;
                r71.e eVar3 = eVarArr[0];
                cVar3.getClass();
                k71.k.g(eVar3, "property");
                cVar3.d = str3;
                cVar3.c = true;
                SharedPreferences.Editor edit3 = cVar3.b.edit();
                k71.k.c(edit3, "editor");
                edit3.putString("user_name", str3);
                edit3.apply();
                break;
        }
        return w61.a0.a;
    }
}

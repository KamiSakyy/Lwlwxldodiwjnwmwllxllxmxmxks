package sy;

import com.github.service.models.response.fileschanged.CommentLevelType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jo.qr;
import jo.tr;
import jo.ur;
import jo.wr;
import jo.zr;
import y41.t1;
import yz0.k3;
import yz0.y2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public static k3 a(String str, zr zrVar, CommentLevelType commentLevelType, qr qrVar, ArrayList arrayList, ArrayList arrayList2, String str2, String str3, nv.a aVar, String str4, String str5, boolean z, String str6, boolean z2, boolean z3, boolean z4) {
        y2 y2Var;
        nv.a aVar2;
        k71.k.g(commentLevelType, "commentType");
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Collection collection = x61.rShadow.r;
        Collection collection2 = arrayList2 == null ? collection : arrayList2;
        ArrayList arrayList5 = new ArrayList(x61.n.F(collection2, 10));
        Iterator it = collection2.iterator();
        while (true) {
            y2Var = null;
            if (!it.hasNext()) {
                break;
            }
            arrayList5.add(Boolean.valueOf(arrayList3.add(aa1.b.f(((ur) it.next()).b, (List) null))));
        }
        Collection collection3 = arrayList == null ? collection : arrayList;
        ArrayList arrayList6 = new ArrayList(x61.n.F(collection3, 10));
        Iterator it2 = collection3.iterator();
        while (it2.hasNext()) {
            arrayList6.add(Boolean.valueOf(arrayList3.add(aa1.b.f(((tr) it2.next()).b, (List) null))));
        }
        Collection collection4 = qrVar != null ? qrVar.a : null;
        if (collection4 != null) {
            collection = collection4;
        }
        ArrayList S = x61.m.S(collection);
        ArrayList arrayList7 = new ArrayList(x61.n.F(S, 10));
        boolean z5 = false;
        int i = 0;
        for (int size = S.size(); i < size; size = size) {
            wr wrVar = (wr) S.get(i);
            ArrayList arrayList8 = arrayList7;
            ArrayList arrayList9 = arrayList4;
            arrayList8.add(Boolean.valueOf(arrayList9.add(aa1.b.e(wrVar.e, str3, str, wrVar.f, wrVar.i, str2, t1.P(wrVar.c), (String) null, wrVar.b, wrVar.g.b, aVar, str4, str5, z4, z, str6, z2, z3, wrVar.h, commentLevelType))));
            arrayList4 = arrayList9;
            arrayList7 = arrayList8;
            i++;
            y2Var = y2Var;
            arrayList3 = arrayList3;
            S = S;
        }
        ArrayList arrayList10 = arrayList3;
        y2 y2Var2 = y2Var;
        ArrayList arrayList11 = arrayList4;
        if (zrVar != null) {
            aVar2 = aVar;
            arrayList11.add(aa1.b.e(zrVar.h, str3, str, zrVar.i, zrVar.l, str2, t1.P(zrVar.g), (String) null, zrVar.f, zrVar.j.b, aVar2, str4, str5, z4, z, str6, z2, z3, zrVar.k, commentLevelType));
            z5 = true;
        } else {
            aVar2 = aVar;
        }
        return new k3(str2, commentLevelType, str3, aVar2 != null ? new y2(aVar2.a, aVar2.b, aVar2.c, aVar2.d) : y2Var2, str4, str5, z, arrayList10, arrayList11, z5, z4);
    }
}

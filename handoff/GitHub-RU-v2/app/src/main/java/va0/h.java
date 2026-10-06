package va0;

import com.github.service.models.response.fileschanged.CommentLevelType;
import com.github.service.models.response.type.DiffLineType;
import com.github.service.models.response.type.PullRequestReviewCommentState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import t.a0;
import u10.an;
import u10.bn;
import u10.dn;
import u10.gn;
import u10.xm;
import x61.rShadow;
import yz0.b1;
import yz0.k3;
import yz0.y2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public static k3 a(String str, gn gnVar, CommentLevelType commentLevelType, xm xmVar, ArrayList arrayList, ArrayList arrayList2, String str2, String str3, g80.a aVar, String str4, String str5, boolean z, String str6, boolean z2, boolean z3, boolean z4) {
        y2 y2Var;
        g80.a aVar2;
        DiffLineType diffLineType;
        DiffLineType diffLineType2;
        k71.k.g(commentLevelType, "commentType");
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Collection collection = rShadow.r;
        Collection collection2 = arrayList2 == null ? collection : arrayList2;
        ArrayList arrayList5 = new ArrayList(x61.n.F(collection2, 10));
        Iterator it = collection2.iterator();
        while (true) {
            y2Var = null;
            if (!it.hasNext()) {
                break;
            }
            arrayList5.add(Boolean.valueOf(arrayList3.add(a0.b(((bn) it.next()).b, (List) null))));
        }
        Collection collection3 = arrayList == null ? collection : arrayList;
        ArrayList arrayList6 = new ArrayList(x61.n.F(collection3, 10));
        Iterator it2 = collection3.iterator();
        while (it2.hasNext()) {
            arrayList6.add(Boolean.valueOf(arrayList3.add(a0.b(((an) it2.next()).b, (List) null))));
        }
        Collection collection4 = xmVar != null ? xmVar.a : null;
        if (collection4 != null) {
            collection = collection4;
        }
        ArrayList S = x61.m.S(collection);
        ArrayList arrayList7 = new ArrayList(x61.n.F(S, 10));
        int size = S.size();
        boolean z5 = false;
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            dn dnVar = (dn) S.get(i);
            ArrayList arrayList8 = S;
            c40.c cVar = dnVar.e;
            int i3 = size;
            i80.c cVar2 = dnVar.f;
            y60.a aVar3 = dnVar.i;
            PullRequestReviewCommentState M = k21.f.M(dnVar.c);
            y2 y2Var2 = y2Var;
            String str7 = dnVar.b;
            boolean z6 = dnVar.g.b;
            b1 b1Var = (b1) x61.m.f0(arrayList3);
            if (b1Var == null || (diffLineType2 = b1Var.c) == null) {
                diffLineType2 = DiffLineType.UNKNOWN__;
            }
            ArrayList arrayList9 = arrayList7;
            ArrayList arrayList10 = arrayList4;
            arrayList9.add(Boolean.valueOf(arrayList10.add(a0.a(cVar, str3, str, cVar2, aVar3, str2, M, (String) null, str7, z6, diffLineType2, aVar, str4, str5, z4, z, str6, z2, z3, dnVar.h, commentLevelType))));
            arrayList4 = arrayList10;
            arrayList7 = arrayList9;
            i = i2;
            y2Var = y2Var2;
            arrayList3 = arrayList3;
            S = arrayList8;
            size = i3;
        }
        ArrayList arrayList11 = arrayList3;
        y2 y2Var3 = y2Var;
        ArrayList arrayList12 = arrayList4;
        if (gnVar != null) {
            c40.c cVar3 = gnVar.h;
            i80.c cVar4 = gnVar.i;
            y60.a aVar4 = gnVar.l;
            PullRequestReviewCommentState M2 = k21.f.M(gnVar.g);
            String str8 = gnVar.f;
            boolean z7 = gnVar.j.b;
            b1 b1Var2 = (b1) x61.m.f0(arrayList11);
            if (b1Var2 == null || (diffLineType = b1Var2.c) == null) {
                diffLineType = DiffLineType.UNKNOWN__;
            }
            aVar2 = aVar;
            arrayList12.add(a0.a(cVar3, str3, str, cVar4, aVar4, str2, M2, (String) null, str8, z7, diffLineType, aVar2, str4, str5, z4, z, str6, z2, z3, gnVar.k, commentLevelType));
            z5 = true;
        } else {
            aVar2 = aVar;
        }
        return new k3(str2, commentLevelType, str3, aVar2 != null ? new y2(aVar2.a, aVar2.b, aVar2.c, aVar2.d) : y2Var3, str4, str5, z, arrayList11, arrayList12, z5, z4);
    }
}

package pl0;

import com.github.service.models.response.fileschanged.CommentLevelType;
import com.github.service.models.response.type.DiffLineType;
import com.github.service.models.response.type.PullRequestReviewCommentState;
import com.google.android.gms.internal.measurement.b4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kc0.bo;
import kc0.fo;
import kc0.go;
import kc0.io;
import kc0.lo;
import x61.rShadow;
import yz0.b1;
import yz0.k3;
import yz0.y2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h {
    public static k3 a(String str, lo loVar, CommentLevelType commentLevelType, bo boVar, ArrayList arrayList, ArrayList arrayList2, String str2, String str3, yi0.a aVar, String str4, String str5, boolean z, String str6, boolean z2, boolean z3, boolean z4) {
        y2 y2Var;
        yi0.a aVar2;
        DiffLineType diffLineType;
        DiffLineType diffLineType2;
        k71.k.g(commentLevelType, "commentType");
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        List list = rShadow.r;
        List list2 = arrayList2 == null ? list : arrayList2;
        ArrayList arrayList5 = new ArrayList(x61.n.F(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            y2Var = null;
            if (!it.hasNext()) {
                break;
            }
            arrayList5.add(Boolean.valueOf(arrayList3.add(b4.c(((go) it.next()).b, null))));
        }
        List list3 = arrayList == null ? list : arrayList;
        ArrayList arrayList6 = new ArrayList(x61.n.F(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            arrayList6.add(Boolean.valueOf(arrayList3.add(b4.c(((fo) it2.next()).b, null))));
        }
        List list4 = boVar != null ? boVar.a : null;
        if (list4 != null) {
            list = list4;
        }
        ArrayList S = x61.m.S(list);
        ArrayList arrayList7 = new ArrayList(x61.n.F(S, 10));
        int size = S.size();
        boolean z5 = false;
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            io ioVar = (io) S.get(i);
            ArrayList arrayList8 = S;
            se0.c cVar = ioVar.e;
            int i3 = size;
            aj0.c cVar2 = ioVar.f;
            qh0.a aVar3 = ioVar.i;
            PullRequestReviewCommentState t = t.e.t(ioVar.c);
            y2 y2Var2 = y2Var;
            String str7 = ioVar.b;
            boolean z6 = ioVar.g.b;
            b1 b1Var = (b1) x61.m.f0(arrayList3);
            if (b1Var == null || (diffLineType2 = b1Var.c) == null) {
                diffLineType2 = DiffLineType.UNKNOWN__;
            }
            ArrayList arrayList9 = arrayList7;
            ArrayList arrayList10 = arrayList4;
            arrayList9.add(Boolean.valueOf(arrayList10.add(b4.b(cVar, str3, str, cVar2, aVar3, str2, t, null, str7, z6, diffLineType2, aVar, str4, str5, z4, z, str6, z2, z3, ioVar.h, commentLevelType))));
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
        if (loVar != null) {
            se0.c cVar3 = loVar.h;
            aj0.c cVar4 = loVar.i;
            qh0.a aVar4 = loVar.l;
            PullRequestReviewCommentState t2 = t.e.t(loVar.g);
            String str8 = loVar.f;
            boolean z7 = loVar.j.b;
            b1 b1Var2 = (b1) x61.m.f0(arrayList11);
            if (b1Var2 == null || (diffLineType = b1Var2.c) == null) {
                diffLineType = DiffLineType.UNKNOWN__;
            }
            aVar2 = aVar;
            arrayList12.add(b4.b(cVar3, str3, str, cVar4, aVar4, str2, t2, null, str8, z7, diffLineType, aVar2, str4, str5, z4, z, str6, z2, z3, loVar.k, commentLevelType));
            z5 = true;
        } else {
            aVar2 = aVar;
        }
        return new k3(str2, commentLevelType, str3, aVar2 != null ? new y2(aVar2.a, aVar2.b, aVar2.c, aVar2.d) : y2Var3, str4, str5, z, arrayList11, arrayList12, z5, z4);
    }
}

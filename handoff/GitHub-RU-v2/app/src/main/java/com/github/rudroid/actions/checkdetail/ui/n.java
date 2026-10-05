package com.github.rudroid.actions.checkdetail.ui;

import com.github.rudroid.issueorpullrequest.ui.copilot.codereview.CopilotNegativeReviewFeedbackBottomSheet;
import d3.c0;
import d3.x;
import d3.z;
import e6.w;
import java.util.ArrayList;
import java.util.List;
import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class n implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4750r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f4751s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f4752t;

    public /* synthetic */ n(String str, int i, String str2) {
        this.f4750r = i;
        this.f4751s = str;
        this.f4752t = str2;
    }

    public final Object k(Object obj) {
        int i = this.f4750r;
        int i10 = 0;
        a0 a0Var = a0.a;
        String str = this.f4752t;
        String str2 = this.f4751s;
        switch (i) {
            case k5.f.J:
                c0 c0Var = (c0) obj;
                k71.k.g(c0Var, "$this$semantics");
                z.g(c0Var, str2 + " " + str);
                break;
            case 1:
                c0 c0Var2 = (c0) obj;
                k71.k.g(c0Var2, "$this$semantics");
                z.g(c0Var2, str2 + " " + str);
                break;
            case 2:
                c0 c0Var3 = (c0) obj;
                k71.k.g(c0Var3, "$this$clearAndSetSemantics");
                z.g(c0Var3, str2);
                z.d(c0Var3, str, null);
                z.l(c0Var3, 0);
                break;
            case 3:
                c0 c0Var4 = (c0) obj;
                CopilotNegativeReviewFeedbackBottomSheet.a aVar = CopilotNegativeReviewFeedbackBottomSheet.Companion;
                k71.k.g(c0Var4, "$this$semantics");
                z.g(c0Var4, str2);
                z.n(c0Var4, str);
                break;
            case 4:
                c0 c0Var5 = (c0) obj;
                k71.k.g(c0Var5, "$this$semantics");
                z.g(c0Var5, str2);
                z.n(c0Var5, str);
                break;
            case 5:
                c0 c0Var6 = (c0) obj;
                k71.k.g(c0Var6, "$this$semantics");
                z.g(c0Var6, str2);
                z.n(c0Var6, str);
                break;
            case 6:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (t71.p.I((String) obj2, str2, true)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj3 = arrayList.get(i10);
                    i10++;
                    String str3 = (String) obj3;
                    arrayList2.add(new com.github.rudroid.repositorycreation.gitignore.b(str3, k71.k.b(str3, str)));
                }
                break;
            case 7:
                c0 c0Var7 = (c0) obj;
                k71.k.g(c0Var7, "$this$semantics");
                z.l(c0Var7, 0);
                z.n(c0Var7, str2);
                z.d(c0Var7, str, null);
                break;
            case 8:
                c0 c0Var8 = (c0) obj;
                k71.k.g(c0Var8, "$this$semantics");
                if (str2 != null) {
                    z.g(c0Var8, str2);
                }
                if (str != null) {
                    r71.e[] eVarArr = z.f21512a;
                    c0Var8.a(x.L, str);
                    break;
                }
                break;
            case 9:
                c0 c0Var9 = (c0) obj;
                k71.k.g(c0Var9, "$this$semantics");
                z.f(c0Var9, str2, null);
                z.g(c0Var9, str);
                break;
            case 10:
                c0 c0Var10 = (c0) obj;
                k71.k.g(c0Var10, "$this$semantics");
                z.f(c0Var10, str2, null);
                z.g(c0Var10, str);
                break;
            case w.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                z.g((c0) obj, str2 + ", " + str);
                break;
            case w.HAS_IMAGE_ALPHA_FIELD_NUMBER /* 12 */:
                c0 c0Var11 = (c0) obj;
                k71.k.g(c0Var11, "$this$semantics");
                z.g(c0Var11, str2);
                z.n(c0Var11, str);
                break;
            case 13:
                c0 c0Var12 = (c0) obj;
                k71.k.g(c0Var12, "$this$semantics");
                z.n(c0Var12, str2);
                if (str != null) {
                    z.g(c0Var12, str);
                    break;
                }
                break;
            default:
                c0 c0Var13 = (c0) obj;
                k71.k.g(c0Var13, "$this$semantics");
                z.g(c0Var13, str2);
                z.n(c0Var13, str);
                break;
        }
        return a0Var;
    }
}

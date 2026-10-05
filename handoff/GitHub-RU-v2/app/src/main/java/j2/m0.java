package j2;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f26904a = 0;

    static {
        int i = d2.t.l;
    }

    public static final List a(String str) {
        if (str != null) {
            h0.b1 b1Var = new h0.b1(1);
            ArrayList arrayList = b1Var.f24908a;
            if (arrayList == null) {
                arrayList = new ArrayList();
                b1Var.f24908a = arrayList;
            } else {
                arrayList.clear();
            }
            b1Var.b(str, arrayList);
            ArrayList arrayList2 = b1Var.f24908a;
            if (arrayList2 != null) {
                return arrayList2;
            }
        }
        return x61.r.r;
    }
}

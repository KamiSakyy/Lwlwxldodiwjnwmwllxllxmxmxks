package v00;

import aa.t0;
import aa.u0;
import com.github.service.models.response.copilot.CopilotCodeReviewFeedbackOption;
import com.github.service.models.response.copilot.CopilotCodeReviewFeedbackType;
import java.util.ArrayList;
import jo.gr;
import jo.mi0;
import kotlin.NoWhenBranchMatchedException;
import m10.a8;
import m10.c8;
import t00.g3;
import y71.n1Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b implements z01.j, mi0 {
    public com.github.service.wrapper.j r;
    public v71.v s;

    public b(com.github.service.wrapper.j jVar, v71.v vVar) {
        k71.k.g(jVar, "client");
        k71.k.g(vVar, "ioDispatcher");
        this.r = jVar;
        this.s = vVar;
    }

    public final y71.i a(String str, CopilotCodeReviewFeedbackType copilotCodeReviewFeedbackType, ArrayList arrayList, String str2) {
        c8 c8Var;
        a8 a8Var;
        k71.k.g(str, "commentId");
        k71.k.g(copilotCodeReviewFeedbackType, "feedback");
        int i = uy.a.a[copilotCodeReviewFeedbackType.ordinal()];
        if (i == 1) {
            c8Var = c8.t;
        } else if (i == 2) {
            c8Var = c8.s;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            c8Var = c8.u;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            switch (uy.b.a[((CopilotCodeReviewFeedbackOption) obj).ordinal()]) {
                case 1:
                    a8Var = a8.s;
                    break;
                case 2:
                    a8Var = a8.t;
                    break;
                case 3:
                    a8Var = a8.u;
                    break;
                case 4:
                    a8Var = a8.v;
                    break;
                case 5:
                    a8Var = a8.A;
                    break;
                case 6:
                    a8Var = a8.w;
                    break;
                case 7:
                    a8Var = a8.x;
                    break;
                case 8:
                    a8Var = a8.y;
                    break;
                case 9:
                    a8Var = a8.z;
                    break;
                case 10:
                    a8Var = a8.B;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList2.add(a8Var);
        }
        return n1.y(new g3(in.rShadow.h(this.r.d(new gr(str, c8Var, new u0(arrayList2), str2 == null ? t0.d : new u0(str2)))), 21), this.s);
    }

    public final Object h() {
        return this;
    }
}

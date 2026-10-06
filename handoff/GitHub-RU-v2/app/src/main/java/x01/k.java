package x01;

import androidx.lifecycle.l1;
import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import com.google.android.gms.internal.measurement.i4;
import in.j0;
import java.util.Arrays;
import q81.a0;
import q81.q;
import q81.x;
import q81.y;
import sy.c0;
import t71.n;
import t71.p;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k extends c0 implements g {
    public static final j Companion = new j();
    public final String r;
    public final String s;

    public k(String str, String str2) {
        k71.k.g(str, "token");
        this.r = str;
        this.s = str2;
    }

    @Override // x01.g
    public final String a() {
        return "VerifyGraphQlRequest";
    }

    public final androidx.lifecycle.b k() {
        l1 l1Var = new l1(11);
        String str = this.s;
        l1Var.I((str == null || str.length() == 0) ? "https://api.github.com/graphql" : xb.a.a(str) ? String.format("https://api.%s/graphql", Arrays.copyOf(new Object[]{str}, 1)) : String.format("https://%s/api/graphql", Arrays.copyOf(new Object[]{str}, 1)));
        l1Var.g("Authorization", "Bearer " + this.r);
        l1Var.G(j0.class, new j0());
        x xVar = y.Companion;
        n nVar = q.d;
        q V = i4.V("application/json");
        xVar.getClass();
        l1Var.A(x.a("{\n  \"operationName\": \"CheckQuery\",\n  \"query\": \"query CheckQuery {viewer{login}}\"\n}", V));
        return new androidx.lifecycle.b(l1Var);
    }

    public final xz0.c n(a0 a0Var) {
        String t;
        if (!a0Var.H) {
            xz0.b bVar = xz0.c.Companion;
            ApiFailure apiFailure = new ApiFailure(ApiFailureType.HTTP_ERROR, null, null, Integer.valueOf(a0Var.u), null, null, null, 112);
            bVar.getClass();
            return xz0.b.a(apiFailure, null);
        }
        try {
            xz0.b bVar2 = xz0.c.Companion;
            q81.c0 c0Var = a0Var.x;
            boolean z = false;
            if (c0Var != null && (t = c0Var.t()) != null) {
                z = p.I(t, "\"login\"", false);
            }
            Boolean valueOf = Boolean.valueOf(z);
            bVar2.getClass();
            return xz0.b.b(valueOf);
        } catch (Exception e) {
            xz0.b bVar3 = xz0.c.Companion;
            ApiFailure apiFailure2 = new ApiFailure(ApiFailureType.PARSE_ERROR, "response parsing error", null, null, null, null, e, 56);
            bVar3.getClass();
            return xz0.b.a(apiFailure2, null);
        }
    }
}

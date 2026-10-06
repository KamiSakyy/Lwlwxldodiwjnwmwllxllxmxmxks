package aa;

import a0.s0;
import com.apollographql.apollo.exception.ApolloException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: /home/user/work/p/classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public UUID f643a;

    /* renamed from: b, reason: collision with root package name */
    public s0 f644b;

    /* renamed from: c, reason: collision with root package name */
    public r0 f645c;

    /* renamed from: d, reason: collision with root package name */
    public List f646d;

    /* renamed from: e, reason: collision with root package name */
    public ApolloException f647e;

    /* renamed from: f, reason: collision with root package name */
    public Map f648f;

    /* renamed from: g, reason: collision with root package name */
    public g0 f649g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f650h;

    public f(UUID uuid, s0 s0Var, r0 r0Var, List list, ApolloException apolloException, Map map, g0 g0Var, boolean z10) {
        this.f643a = uuid;
        this.f644b = s0Var;
        this.f645c = r0Var;
        this.f646d = list;
        this.f647e = apolloException;
        this.f648f = map;
        this.f649g = g0Var;
        this.f650h = z10;
    }

    public final e a() {
        e eVar = new e(this.f644b, this.f643a, this.f645c, this.f646d, this.f648f, this.f647e);
        eVar.c(this.f649g);
        eVar.f635a = this.f650h;
        return eVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApolloResponse(operationName=");
        s0 s0Var = this.f644b;
        sb2.append(s0Var.name());
        sb2.append(", data=");
        String str = "null";
        sb2.append(this.f645c == null ? "null" : s0Var.name().concat(".Data"));
        sb2.append(", errors=");
        List list = this.f646d;
        sb2.append(list != null ? Integer.valueOf(list.size()) : "null");
        sb2.append(", exception=");
        ApolloException apolloException = this.f647e;
        if (apolloException != null && (str = k71.x.a(apolloException.getClass()).c()) == null) {
            str = "true";
        }
        return a0.s0.m(sb2, str, ')');
    }

    public Object b = null;
    public Object e = null;
    public Object g = null;
}

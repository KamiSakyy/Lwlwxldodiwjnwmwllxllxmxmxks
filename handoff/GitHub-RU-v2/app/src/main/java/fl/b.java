package fl;

import a0.s0;
import com.github.service.models.ApiFailure;
import java.util.Map;
import k71.k;
import oa.j;
import x61.s;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public static final a Companion = new a();
    public final c a;
    public final String b;
    public final Integer c;
    public final Map d;
    public final j e;
    public final Throwable f;
    public final long g;
    public final String h;
    public final String i;
    public final String j;

    public b(c cVar, String str, Integer num, Map map, j jVar, Throwable th2, long j) {
        k.g(cVar, "failureType");
        k.g(map, "failureData");
        k.g(jVar, "user");
        k.g(th2, "throwable");
        this.a = cVar;
        this.b = str;
        this.c = num;
        this.d = map;
        this.e = jVar;
        this.f = th2;
        this.g = j;
        this.h = (String) map.get("failure_data_key_owner_login");
        this.i = (String) map.get("failure_data_key_owner_name");
        this.j = (String) map.get("failure_data_key_avatar_url");
    }

    public final boolean a() {
        if (this.a == c.s) {
            return false;
        }
        Integer num = this.c;
        return num == null || num.intValue() < 400 || num.intValue() > 499;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && k.b(this.b, bVar.b) && k.b(this.c, bVar.c) && k.b(this.d, bVar.d) && k.b(this.e, bVar.e) && k.b(this.f, bVar.f) && this.g == bVar.g;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        return Long.hashCode(this.g) + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExecutionError(failureType=");
        sb.append(this.a);
        sb.append(", message=");
        sb.append(this.b);
        sb.append(", code=");
        sb.append(this.c);
        sb.append(", failureData=");
        sb.append(this.d);
        sb.append(", user=");
        sb.append(this.e);
        sb.append(", throwable=");
        sb.append(this.f);
        sb.append(", timestamp=");
        return s0.f(this.g, ")", sb);
    }

    public /* synthetic */ b(c cVar, String str, Integer num, Map map, j jVar, ApiFailure apiFailure, int i) {
        this(cVar, str, num, (i & 8) != 0 ? s.r : map, jVar, (Throwable) ((i & 32) != 0 ? new Throwable(str) : apiFailure), System.currentTimeMillis());
    }
}

package xz0;

import com.github.service.models.ApiFailure;
import com.github.service.models.ApiRequestStatus;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public static final b Companion = new b();
    public ApiRequestStatus a;
    public Object b;
    public ApiFailure c;

    public c(ApiRequestStatus apiRequestStatus, Object obj, ApiFailure apiFailure) {
        k.g(apiRequestStatus, "status");
        this.a = apiRequestStatus;
        this.b = obj;
        this.c = apiFailure;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && k.b(this.b, cVar.b) && k.b(this.c, cVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        ApiFailure apiFailure = this.c;
        return hashCode2 + (apiFailure != null ? apiFailure.hashCode() : 0);
    }

    public final String toString() {
        return "ApiModel(status=" + this.a + ", data=" + this.b + ", apiFailure=" + this.c + ")";
    }
}

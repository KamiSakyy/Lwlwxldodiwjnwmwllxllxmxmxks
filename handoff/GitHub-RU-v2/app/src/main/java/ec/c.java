package ec;

import com.github.service.models.response.type.MobileSubjectType;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final fc.a f22208a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f22209b;

    /* renamed from: c, reason: collision with root package name */
    public final MobileSubjectType f22210c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f22211d;

    public /* synthetic */ c(fc.a aVar, MobileSubjectType mobileSubjectType, boolean z10, int i) {
        this(aVar, (Boolean) null, (i & 4) != 0 ? null : mobileSubjectType, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.b(this.f22208a, cVar.f22208a) && k.b(this.f22209b, cVar.f22209b) && this.f22210c == cVar.f22210c && this.f22211d == cVar.f22211d;
    }

    public final int hashCode() {
        int hashCode = this.f22208a.hashCode() * 31;
        Boolean bool = this.f22209b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        MobileSubjectType mobileSubjectType = this.f22210c;
        return Boolean.hashCode(this.f22211d) + ((hashCode2 + (mobileSubjectType != null ? mobileSubjectType.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CreateIssueComposeData(createIssueData=" + this.f22208a + ", fromShareExtension=" + this.f22209b + ", navigationSource=" + this.f22210c + ", hasProjectsCapability=" + this.f22211d + ")";
    }

    public c(fc.a aVar, Boolean bool, MobileSubjectType mobileSubjectType, boolean z10) {
        this.f22208a = aVar;
        this.f22209b = bool;
        this.f22210c = mobileSubjectType;
        this.f22211d = z10;
    }
}

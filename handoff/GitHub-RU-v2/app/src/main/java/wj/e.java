package wj;

import com.github.rudroid.copilot.h1;
import com.github.service.models.response.type.MobileAppAction;
import com.github.service.models.response.type.MobileAppElement;
import com.github.service.models.response.type.MobileEventContext;
import com.github.service.models.response.type.MobileSubjectType;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public static final d Companion = new d();
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public e(int i, String str, String str2, String str3, String str4, String str5) {
        k.g(str, "appElement");
        k.g(str2, "appAction");
        k.g(str3, "performedAt");
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && k.b(this.b, eVar.b) && k.b(this.c, eVar.c) && k.b(this.d, eVar.d) && k.b(this.e, eVar.e) && k.b(this.f, eVar.f);
    }

    public final int hashCode() {
        int i = h1.i(h1.i(h1.i(Integer.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
        String str = this.e;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder n = i.n(this.a, "EventEntry(uuid=", ", appElement=", this.b, ", appAction=");
        f1.e.x(n, this.c, ", performedAt=", this.d, ", subjectType=");
        return i.k(n, this.e, ", context=", this.f, ")");
    }

    public /* synthetic */ e(MobileAppElement mobileAppElement, MobileAppAction mobileAppAction, MobileSubjectType mobileSubjectType, MobileEventContext mobileEventContext, int i) {
        this(mobileAppAction, mobileAppElement, (i & 8) != 0 ? null : mobileEventContext, (i & 4) != 0 ? null : mobileSubjectType);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(MobileAppAction mobileAppAction, MobileAppElement mobileAppElement, MobileEventContext mobileEventContext, MobileSubjectType mobileSubjectType) {
        this(0, r3, r4, r5, mobileSubjectType != null ? mobileSubjectType.getRawValue() : null, mobileEventContext != null ? mobileEventContext.getRawValue() : null);
        k.g(mobileAppElement, "appElement");
        k.g(mobileAppAction, "appAction");
        String rawValue = mobileAppElement.getRawValue();
        String rawValue2 = mobileAppAction.getRawValue();
        String zonedDateTime = ZonedDateTime.now(ZoneOffset.UTC).toString();
        k.f(zonedDateTime, "toString(...)");
    }
    public Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}

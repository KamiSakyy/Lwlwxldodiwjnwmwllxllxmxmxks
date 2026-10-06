package jn;

import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public final String a;
    public final ZonedDateTime b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final ArrayList g;
    public final String h;

    public h(String str, ZonedDateTime zonedDateTime, String str2, String str3, String str4, String str5, ArrayList arrayList, String str6) {
        k.g(str2, "achievableName");
        k.g(str3, "achievableSlug");
        this.a = str;
        this.b = zonedDateTime;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = arrayList;
        this.h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a.equals(hVar.a) && this.b.equals(hVar.b) && k.b(this.c, hVar.c) && k.b(this.d, hVar.d) && this.e.equals(hVar.e) && this.f.equals(hVar.f) && this.g.equals(hVar.g) && this.h.equals(hVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + no.a.b(this.g, h1.i(h1.i(h1.i(h1.i(m0.a(this.b, this.a.hashCode() * 31, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), 31);
    }

    public final String toString() {
        StringBuilder s = h1.s("UserAchievementItem(localizedDescription=", this.a, ", unlockedAt=", ", achievableName=", this.b);
        f1.e.x(s, this.c, ", achievableSlug=", this.d, ", highResolutionBadgeImageUrl=");
        f1.e.x(s, this.e, ", backgroundHexColor=", this.f, ", unlockingModels=");
        s.append(this.g);
        s.append(", url=");
        s.append(this.h);
        s.append(")");
        return s.toString();
    }
}

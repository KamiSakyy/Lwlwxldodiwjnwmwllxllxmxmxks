package com.github.rudroid.viewmodels.notifications;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    public final dd.a a;
    public final List b;
    public final boolean c;
    public final boolean d;

    public i(dd.a aVar, List list, boolean z, boolean z2) {
        k71.k.g(aVar, "banner");
        this.a = aVar;
        this.b = list;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return k71.k.b(this.a, iVar.a) && k71.k.b(this.b, iVar.b) && this.c == iVar.c && this.d == iVar.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return Boolean.hashCode(this.d) + x.i.e((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationUiModel(banner=");
        sb.append(this.a);
        sb.append(", notifications=");
        sb.append(this.b);
        sb.append(", scrollToTop=");
        return com.github.rudroid.m0.m(sb, this.c, ", tryDisplayRatingPrompt=", this.d, ")");
    }
}

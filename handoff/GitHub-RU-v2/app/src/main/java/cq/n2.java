package cq;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n2 implements aa.h0 {
    public final String a;
    public final ArrayList b;

    public n2(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj;
        return this.a.equals(n2Var.a) && this.b.equals(n2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MobileCopilotFeatureComparisonSubsectionFragment(title=" + this.a + ", planRows=" + this.b + ")";
    }
}

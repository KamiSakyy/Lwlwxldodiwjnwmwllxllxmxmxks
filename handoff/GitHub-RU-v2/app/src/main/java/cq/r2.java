package cq;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r2 implements aa.h0 {
    public String a;
    public ArrayList b;

    public r2(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        return this.a.equals(r2Var.a) && this.b.equals(r2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MobileCopilotPaywallChatModelsFragment(title=" + this.a + ", plans=" + this.b + ")";
    }
}

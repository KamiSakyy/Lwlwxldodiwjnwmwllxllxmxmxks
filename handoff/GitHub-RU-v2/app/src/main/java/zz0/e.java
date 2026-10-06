package zz0;

import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public class e {
    public String a;

    public e(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && k.b(this.a, ((e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("ProvideCopilotCodeReviewFeedbackResponse(commentId=", this.a, ")");
    }
}

package com.github.rudroid.viewmodels;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s {
    public String a;

    public s(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.a.equals(((s) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return f1.e.z("CopilotCodeReviewFeedbackState(commentId=", this.a, ", submittedFeedback=null)");
    }
}

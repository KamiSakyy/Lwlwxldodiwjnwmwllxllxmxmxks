package com.github.rudroid.issueorpullrequest.ui.copilot.codereview;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final List f16731a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16732b;

    public n(List list, String str) {
        this.f16731a = list;
        this.f16732b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    public static n a(n nVar, ArrayList arrayList, String str, int i) {
        ArrayList arrayList2 = arrayList;
        if ((i & 1) != 0) {
            arrayList2 = nVar.f16731a;
        }
        if ((i & 2) != 0) {
            str = nVar.f16732b;
        }
        nVar.getClass();
        return new n(arrayList2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return k71.k.b(this.f16731a, nVar.f16731a) && k71.k.b(this.f16732b, nVar.f16732b);
    }

    public final int hashCode() {
        int hashCode = this.f16731a.hashCode() * 31;
        String str = this.f16732b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CopilotReviewFeedbackUiModel(selectedOptions=" + this.f16731a + ", textResponse=" + this.f16732b + ")";
    }
}

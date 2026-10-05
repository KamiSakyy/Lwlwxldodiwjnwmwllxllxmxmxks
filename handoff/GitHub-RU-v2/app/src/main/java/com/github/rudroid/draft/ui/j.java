package com.github.rudroid.draft.ui;

import com.github.rudroid.issueorpullrequest.triagesheet.b;

/* loaded from: /home/user/work/p/classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final c01.b f12148a;

    /* renamed from: b, reason: collision with root package name */
    public final b.f f12149b;

    public j(c01.b bVar, b.f fVar) {
        k71.k.g(bVar, "draftIssue");
        this.f12148a = bVar;
        this.f12149b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return k71.k.b(this.f12148a, jVar.f12148a) && k71.k.b(this.f12149b, jVar.f12149b);
    }

    public final int hashCode() {
        return this.f12149b.hashCode() + (this.f12148a.hashCode() * 31);
    }

    public final String toString() {
        return "DraftIssueState(draftIssue=" + this.f12148a + ", projectSectionCard=" + this.f12149b + ")";
    }
}

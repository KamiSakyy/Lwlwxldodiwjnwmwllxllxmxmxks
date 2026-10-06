package com.github.rudroid.repository.pullrequestcreation;

import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f20080a;

    /* renamed from: b, reason: collision with root package name */
    public List f20081b;

    /* renamed from: c, reason: collision with root package name */
    public p01.b f20082c;

    public a(String str, List list, p01.b bVar, int i) {
        str = (i & 1) != 0 ? null : str;
        list = (i & 2) != 0 ? null : list;
        bVar = (i & 4) != 0 ? null : bVar;
        this.f20080a = str;
        this.f20081b = list;
        this.f20082c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k71.k.b(this.f20080a, aVar.f20080a) && k71.k.b(this.f20081b, aVar.f20081b) && k71.k.b(this.f20082c, aVar.f20082c);
    }

    public final int hashCode() {
        String str = this.f20080a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f20081b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        p01.b bVar = this.f20082c;
        return hashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "PullRequestCreationBox(headBranch=" + this.f20080a + ", commitDiff=" + this.f20081b + ", pullRequestCreationResult=" + this.f20082c + ")";
    }
}

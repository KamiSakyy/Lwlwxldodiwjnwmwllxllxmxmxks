package com.github.rudroid.copilot.preferences;

/* loaded from: /home/user/work/p/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f9959a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9960b;

    public b(String str, String str2) {
        this.f9959a = str;
        this.f9960b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.f9959a, bVar.f9959a) && k71.k.b(this.f9960b, bVar.f9960b);
    }

    public final int hashCode() {
        String str = this.f9959a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9960b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return x.i.g("AgentTasksPreferences(lastSelectedRepositoryOwner=", this.f9959a, ", lastSelectedRepositoryName=", this.f9960b, ")");
    }
}

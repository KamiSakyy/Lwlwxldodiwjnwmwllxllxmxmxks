package com.github.rudroid.repository.files;

import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f19533a;

    public a0(List list) {
        this.f19533a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && this.f19533a.equals(((a0) obj).f19533a);
    }

    public final int hashCode() {
        return this.f19533a.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.l(this.f19533a, "ReposFilesUiModel(listItems=", ")");
    }
}

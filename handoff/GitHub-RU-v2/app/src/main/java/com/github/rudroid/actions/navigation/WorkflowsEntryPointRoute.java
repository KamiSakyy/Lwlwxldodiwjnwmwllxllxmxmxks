package com.github.rudroid.actions.navigation;

import g81.e;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;
import x.i;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class WorkflowsEntryPointRoute implements sa.e {
    public static final Companion Companion = new Companion();

    /* renamed from: r, reason: collision with root package name */
    public String f5122r;

    /* renamed from: s, reason: collision with root package name */
    public String f5123s;

    public static final class Companion {
        public final KSerializer serializer() {
            return WorkflowsEntryPointRoute$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WorkflowsEntryPointRoute(String str, int i, String str2) {
        if (3 != (i & 3)) {
            c1Shadow.l(i, 3, WorkflowsEntryPointRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f5122r = str;
        this.f5123s = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkflowsEntryPointRoute)) {
            return false;
        }
        WorkflowsEntryPointRoute workflowsEntryPointRoute = (WorkflowsEntryPointRoute) obj;
        return k.b(this.f5122r, workflowsEntryPointRoute.f5122r) && k.b(this.f5123s, workflowsEntryPointRoute.f5123s);
    }

    public final int hashCode() {
        return this.f5123s.hashCode() + (this.f5122r.hashCode() * 31);
    }

    public final String toString() {
        return i.g("WorkflowsEntryPointRoute(repositoryName=", this.f5122r, ", repositoryOwner=", this.f5123s, ")");
    }
}

package com.github.rudroid.createrepository.model;

import com.github.rudroid.utilities.ui.g1;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final a f10590a;

    /* renamed from: b, reason: collision with root package name */
    public final g1 f10591b;

    /* renamed from: c, reason: collision with root package name */
    public final g1 f10592c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10593d;

    public d(a aVar, g1 g1Var, g1 g1Var2, String str) {
        k.g(aVar, "createRepositoryFormData");
        k.g(g1Var, "nameValidationState");
        k.g(g1Var2, "repositoryCreationState");
        this.f10590a = aVar;
        this.f10591b = g1Var;
        this.f10592c = g1Var2;
        this.f10593d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k.b(this.f10590a, dVar.f10590a) && k.b(this.f10591b, dVar.f10591b) && k.b(this.f10592c, dVar.f10592c) && k.b(this.f10593d, dVar.f10593d);
    }

    public final int hashCode() {
        return this.f10593d.hashCode() + ((this.f10592c.hashCode() + ((this.f10591b.hashCode() + (this.f10590a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CreateRepositoryUiModel(createRepositoryFormData=" + this.f10590a + ", nameValidationState=" + this.f10591b + ", repositoryCreationState=" + this.f10592c + ", sanitizedRepositoryName=" + this.f10593d + ")";
    }
}

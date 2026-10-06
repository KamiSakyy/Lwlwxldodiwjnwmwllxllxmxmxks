package com.github.rudroid.repositorycreation.templaterepository;

import com.github.service.models.response.SimpleRepository;

/* loaded from: /home/user/work/p/classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public SimpleRepository f20444a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f20445b;

    public b(SimpleRepository simpleRepository, boolean z10) {
        this.f20444a = simpleRepository;
        this.f20445b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.f20444a, bVar.f20444a) && this.f20445b == bVar.f20445b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20445b) + (this.f20444a.hashCode() * 31);
    }

    public final String toString() {
        return "TemplateRepositoryItem(repository=" + this.f20444a + ", isSelected=" + this.f20445b + ")";
    }
}

package com.github.rudroid.repositorycreation.templaterepository;

import com.github.rudroid.copilot.h1;
import com.github.rudroid.utilities.ui.g1;
import com.github.service.models.response.SimpleRepository;

/* loaded from: /home/user/work/p/classes.dex */
public class s {
    public static final a Companion = new a();

    /* renamed from: d, reason: collision with root package name */
    public static final s f20473d = new s(g1.a.c(g1.Companion), "", null);

    /* renamed from: a, reason: collision with root package name */
    public g1 f20474a;

    /* renamed from: b, reason: collision with root package name */
    public String f20475b;

    /* renamed from: c, reason: collision with root package name */
    public SimpleRepository f20476c;

    public static final class a {
    }

    public s(g1 g1Var, String str, SimpleRepository simpleRepository) {
        k71.k.g(str, "searchQuery");
        this.f20474a = g1Var;
        this.f20475b = str;
        this.f20476c = simpleRepository;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return k71.k.b(this.f20474a, sVar.f20474a) && k71.k.b(this.f20475b, sVar.f20475b) && k71.k.b(this.f20476c, sVar.f20476c);
    }

    public final int hashCode() {
        int i = h1.i(this.f20474a.hashCode() * 31, this.f20475b, 31);
        SimpleRepository simpleRepository = this.f20476c;
        return i + (simpleRepository == null ? 0 : simpleRepository.hashCode());
    }

    public final String toString() {
        return "TemplateRepositoryPickerUiModel(templatesState=" + this.f20474a + ", searchQuery=" + this.f20475b + ", selectedRepository=" + this.f20476c + ")";
    }
}

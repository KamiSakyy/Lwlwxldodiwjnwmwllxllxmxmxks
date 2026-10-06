package com.github.rudroid.utilities.viewmodel;

import androidx.lifecycle.a1;
import com.github.service.models.response.projects.ProjectsMetaInfo;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public interface f {
    public static final a Companion = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();

        public static f a(a1 a1Var) {
            k.g(a1Var, "savedStateHandle");
            return new b(a1Var);
        }
    }

    public static final class b implements f {
        public ProjectsMetaInfo r;

        public b(a1 a1Var) {
            k.g(a1Var, "savedStateHandle");
            this.r = (ProjectsMetaInfo) a1Var.a("WithProjectsMetaInfo.EXTRA_PROJECTS_META_INFO");
        }

        @Override // com.github.rudroid.utilities.viewmodel.f
        public final ProjectsMetaInfo b() {
            return this.r;
        }
    }

    ProjectsMetaInfo b();
}

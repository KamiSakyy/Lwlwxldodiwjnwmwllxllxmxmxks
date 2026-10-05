package vy0;

import a71.c;
import com.github.service.license.LicenseTemplate;
import com.github.service.repositorycreation.CreateRepositoryInput;
import ga1.f;
import ga1.o;
import java.util.List;
import w61.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public interface a {
    @f("/api/v3/licenses")
    Object a(c<? super List<LicenseTemplate>> cVar);

    @o("/api/v3/user/repos")
    Object b(@ga1.a CreateRepositoryInput createRepositoryInput, c<? super a0> cVar);

    @f("/api/v3/gitignore/templates")
    Object c(c<? super List<String>> cVar);
}


from django.contrib import admin
from django.urls import path
from django.urls import path, include
from .views import Indexx

urlpatterns = [
    path('admin/', admin.site.urls),
    path('', Indexx.as_view(), name='index'),
    path('company/', include('company.urls')),
    path('conta/', include('accounts.urls', namespace='accounts')),
]

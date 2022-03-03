# UserAPIWithHibernate
 Veritabanında kayıtlı bulunan verileri Json formatında dönüş alan Spring boot RESTapi uygulamasıdır.
 
 Gereklilikler:
 -Spring boot web
 -jpa
 -postresql
 
 Veritabanı olarak postgreSQL kullanılmış olup veriler önceden elle girilmiştir. İstenirse "Controller" üzerinde gerekli değişiklikler yapılıp ekleme, silme fonksiyonları entegre edilebilir.
 
 
users tablosunun yapısı 
 ![image](https://user-images.githubusercontent.com/17264859/156495052-1c228e09-d8fb-4e3f-b759-cf13b3ddd6f3.png)
 

countries tablosunun yapısı
![image](https://user-images.githubusercontent.com/17264859/156495115-12ca1828-74c9-4b58-95fc-c1857df88f01.png)

 
 Terminalde proje dizinine gidilip "./mvnw package" komutu çalıştırılırsa uygulamanın Tomcat için .war dosyası deploy edilir.

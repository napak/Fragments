package com.android.curso.fragments.dao;

import com.android.curso.fragments.R;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Animal implements Serializable{
    public static final String KEY = "animal";
    private static final long serialVersionUID = 1620930332312696468L;
    private String nombre;
    private int drawableImageID;

    private String descripcion;

    public Animal(String nombre, int drawableImageID, String descripcion) {
        this.nombre = nombre;
        this.drawableImageID = drawableImageID;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDrawableImageID() {
        return drawableImageID;
    }

    public void setDrawableImageID(int drawableImageID) {
        this.drawableImageID = drawableImageID;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public static List<Animal> getList(){
        List<Animal> items = new ArrayList<>();
        items.add(new Animal("aguila", R.drawable.aguila,"Águila es el nombre dado a las mayores aves depredadoras. Las diversas especies y subespecies de águilas pueden encontrarse en casi cualquier parte del mundo excepto en la Antártida. Son miembros de las aves de presa, del orden de Accipitriformes, (o Falconiformes acorde a una clasificación anterior), familia Accipitridae, subfamilia Buteoninae. Pertenecen a varios géneros, los cuales están sujetos a una reclasificación más adecuada puesto que los expertos no llegan a una opinión consensuada. Las águilas se caracterizan principalmente por su gran tamaño, constitución robusta, cabeza y pico pesados."));
        items.add(new Animal("ballena", R.drawable.ballena,"Los balénidos (Balaenidae) son una familia de cetáceos misticetos que incluye solo cuatro especies listadas más abajo, en dos géneros, Balaena y Eubalaena. Sin embargo el término ballena es usado en sentido amplio para referirse a todos los grandes cetáceos incluidos en el suborden Mysticeti (cetáceos con barbas) como el rorcual azul (Balaenoptera musculus) y a varias especies del suborden Odontoceti (cetáceos dentados), por ejemplo el cachalote (Physeter macrocephalus)."));
        items.add(new Animal("caballo", R.drawable.caballo,"El caballo (Equus ferus caballus) es un mamífero perisodáctilo domesticado de la familia de los équidos. Es un herbívoro solípedo de gran porte, cuello largo y arqueado, poblado por largas crines.\n" +
                "\n" +
                "A la hembra del caballo se le llama yegua y a las crías si son machos potros o potrillos, y si son hembras potras o potrancas. La cría y utilización del caballo por parte del hombre se conoce como ganadería equina o caballar, y su domesticación se remonta a unos 3600 a. C., en la región de Kazajistán."));
        items.add(new Animal("camaleon", R.drawable.camaleon,"Los camaleones son una familia de pequeños saurópsidos (reptiles) escamosos. Existen cerca de 161 especies de camaleones, la mayor parte de ellas en África al sur del Sáhara. En América se llama a menudo camaleones a lagartos de la familia de los anoles, que no guardan ningún parentesco especial con los verdaderos camaleones.\n" +
                "\n" +
                "Son famosos por su habilidad de cambiar de color según las circunstancias, por su lengua rápida y alargada, y por sus ojos, que pueden ser movidos independientemente el uno del otro."));
        items.add(new Animal("canario", R.drawable.canario,"El canario doméstico (Serinus canaria domestica) es una subespecie desarrollada durante siglos de selección en cautividad partiendo de ejemplares del canario silvestre o canario salvaje (Serinus canaria), una especie de ave del orden paseriforme de la familia de los fringílidos, endémica de las islas Canarias, Azores y Madeira.\n" +
                "\n" +
                "Es el ave doméstica criada como animal de compañía más abundante del mundo. A pesar de esto, no se conocen poblaciones asilvestradas."));
        items.add(new Animal("cerdo", R.drawable.cerdo,"El cerdo (Sus scrofa domestica) es una subespecie de mamífero artiodáctilo de la familia Suidae. Es un animal doméstico usado en la alimentación humana por muchos pueblos. Su nombre científico es Sus scrofa ssp. domestica, aunque algunos autores lo denominan Sus domesticus o Sus domestica, reservando Sus scrofa para el jabalí. Su domesticación se inició en el Próximo Oriente hace unos 13 000 años, aunque se produjo un proceso paralelo e independiente de domesticación en China."));
        items.add(new Animal("delfin", R.drawable.delfin,"Los delfínidos (Delphinidae), llamados comúnmente delfines oceánicos (para distinguirlos de los platanistoideos o delfines de río), son una familia de cetáceos odontocetos muy heterogénea, que comprende 34 especies.\n" +
                "\n" +
                "Miden entre 2 y 9 metros de largo, con el cuerpo fusiforme y la cabeza de gran tamaño, el hocico alargado y solo un espiráculo en la parte superior de la cabeza (orificio respiratorio que muchos animales marinos tienen como contacto del aire o agua con su sistema respiratorio interno). Son carnívoros estrictos.\n" +
                "\n" +
                "Están entre las especies más inteligentes que habitan en el planeta. Se encuentran relativamente cerca de las costas y a menudo interactúan con el ser humano."));
        items.add(new Animal("gato", R.drawable.gato,"El gato o gato doméstico (Felis silvestris catus) y coloquialmente llamado minino, micho, mizo o miz; es una subespecie de mamífero carnívoro de la familia Felidae. El gato está en convivencia cercana al ser humano desde hace unos 9500 años, periodo superior al estimado anteriormente, que oscilaba entre 3500 y 8000 años.\n" +
                "\n" +
                "En las lenguas romances los nombres actuales más generalizados derivan del latín vulgar catus, palabra que aludía especialmente a los gatos salvajes en contraposición a los gatos domésticos que, en latín, eran llamados felis."));
        items.add(new Animal("iguana", R.drawable.iguana,"Iguana es un género de reptiles escamosos de la familia Iguanidae nativos de zonas tropicales de Centroamérica, Sudamérica y el Caribe. Fue descrito por primera vez por el naturalista austríaco Josephus Nicolaus Laurenti en su libro Specimen Medicum, Exhibens Synopsin Reptilium Emendatam cum Experimentis circa Venena en 1768. El género Iguana incluye dos especies: la iguana verde (Iguana iguana) y la iguana del Caribe (Iguana delicatissima).\n" +
                "\n" +
                "La palabra «iguana» deriva del nombre taíno para este animal: iwana. Iguana iguana es la especie de este género más usada para la cría en cautiverio."));
        items.add(new Animal("lince", R.drawable.lince,"Lynx es un género de mamíferos carnívoros de la familia Felidae vulgarmente conocidos como linces. Se conocen cuatro especies caracterizadas por su tamaño medio, fuertes patas, largas orejas, cola corta y cuerpo más o menos moteado.\n" +
                "\n" +
                "Todas las especies habitan exclusivamente en el Hemisferio Norte, en Eurasia y Norteamérica (de donde parecen ser originarios). El llamado lince africano (Caracal caracal), que habita en África y gran parte de Asia Central y Occidental, es en realidad un felino escasamente emparentado que guarda algunas semejanzas externas con los representantes del género Lynx fruto de la convergencia evolutiva, como son su cola, excepcionalmente corta (poco más que un simple muñón), y sus grandes orejas, coronadas por largos penachos de pelo negro en la punta que sirven para incrementar su ya de por sí gran audición. También existen unos característicos mechones de pelo largo en las mejillas."));
        items.add(new Animal("lobo", R.drawable.lobo_9,"El lobo (Canis lupus) es una especie de mamífero placentario del orden de los carnívoros. El perro doméstico (Canis lupus familiaris) se considera miembro de la misma especie según distintos indicios, la secuencia del ADN y otros estudios genéticos. Los lobos fueron antaño abundantes y se distribuían por Norteamérica, Eurasia y el Oriente Medio. Actualmente, por una serie de razones relacionadas con el hombre, incluyendo el muy extendido hábito de la caza, los lobos habitan únicamente en una muy limitada porción del que antes fue su territorio."));
        items.add(new Animal("morena", R.drawable.morena,"Los murénidos (Muraenidae) son una familia de peces anguiliformes conocidos vulgarmente como morenas. Habitan aguas tropicales y subtropicales de todo el mundo donde se hallen arrecifes coralinos; permitiéndoles, gracias a su fisonomía serpiforme, acechar a su presa desde las grietas.\n" +
                "\n" +
                "Tienen un cuerpo en forma de serpiente que llega a medir hasta 150 cm."));
        items.add(new Animal("orca", R.drawable.orca,"La orca (Orcinus orca) es una especie de cetáceo odontoceto perteneciente a la familia Delphinidae (delfines oceánicos), que habita en todos los océanos del planeta. Es la especie más grande de delfínido y la única existente actual reconocida dentro del género Orcinus.\n" +
                "\n" +
                "Este cetáceo posee una complexión robusta e hidrodinámica. La especie, como característica distintiva, posee una aleta dorsal muy larga que llega a medir hasta 1,8 m en los machos y presenta una coloración blanca y negra que se distribuye de manera particular, la cual es propia de cada individuo y permite distinguirlo de los demás. La orca tiene un dimorfismo sexual marcado; las hembras son más pequeñas que los machos y tienen la aleta dorsal más corta. Un macho adulto puede alcanzar 5,5 t de peso y hasta 9 m de longitud, mientras que una hembra suele rondar los 7,7 m de largo y pesa menos de 4 t."));
        items.add(new Animal("perro", R.drawable.perro,"El perro o perro doméstico (Canis lupus familiaris) o también llamado can , es un mamífero carnívoro de la familia de los cánidos, que constituye una subespecie del lobo (Canis lupus). Un estudio publicado por la revista Nature revela que, gracias al proceso de domesticación, el organismo del perro se ha adaptado a cierta clase de alimentos, en este caso el almidón. Su tamaño o talla, su forma y pelaje es muy diverso según la raza. Posee un oído y olfato muy desarrollados, siendo este último su principal órgano sensorial. En las razas pequeñas puede alcanzar una longevidad de cerca de 20 años, con atención esmerada por parte del propietario, de otra forma su vida en promedio es alrededor de los 15 años."));
        items.add(new Animal("vaca", R.drawable.vaca,"La vaca en el caso de la hembra, o toro en el caso del macho (Bos primigenius taurus / Bos taurus), es un mamífero artiodáctilo de la familia de los bóvidos. El nombre científico es el que se le asignó al animal vacuno doméstico europeo y norasiático, un conjunto de bóvidos domésticos descendientes de la subespecie de uro salvaje euroasiático conocida como Bos primigenius primigenius; mientras que se denomina Bos primigenius indicus a los cebúes y otras razas bovinas domésticas provenientes del mismo tronco, y descendientes de la subespecie de uro salvaje del Sudeste Asiático, denominado Bos primigenius namadicus. Se trata de un mamífero rumiante grande y de cuerpo robusto, con unos 120-150 cm de altura y 600-800 kg de peso medio."));
        return items;
    }
}

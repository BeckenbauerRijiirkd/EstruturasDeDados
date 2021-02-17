package revisaoPOO;

public class RevisaoPOO {

    public static void main(String[] args) {

        UsaLocadora();
    }

    public static void UsaLocadora() {
        Locadora loca;
        loca = new Locadora();

        Disco discox;
        discox = new Disco("Samba Social Clube 5",
                2014,
                "Vários Sambas",
                "Vários Artistas",
                12,
                "CD");
        loca.novoDisco(discox, 0);
        discox = new Disco("Pode Entrar",
                2009,
                "Ivete e Convidados",
                "Ivete Sangalo",
                14,
                "DVD");
        loca.novoDisco(discox, 1);

        Filme filmex;
        filmex = new Filme("Smurfs 2",
                2013,
                "Gargamel cria a versão malvada dos Smurfs",
                "Raja Gosnell",
                140,
                "animação");
        loca.novoFilme(filmex, 0);

        filmex = new Filme("Os mercenários 2",
                2012,
                "De volta ao mundo",
                "Simon West",
                210,
                "Animação");
        loca.novoFilme(filmex, 1);
        loca.listarDiscos();
        loca.listarFilmes();
    }

    public static abstract class Item {

        //atributos
        public String titulo;
        public int anolancamento;
        public String comentario;

        //construtores
        public Item() {
        }

        public Item(String titulo, int anolancamento, String comentario) {
            this.titulo = titulo;
            this.anolancamento = anolancamento;
            this.comentario = comentario;
        }

        // GETS AND SETS
        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public int getAnolancamento() {
            return anolancamento;
        }

        public void setAnolancamento(int anolancamento) {
            this.anolancamento = anolancamento;
        }

        public String getComentario() {
            return comentario;
        }

        public void setComentario(String comentario) {
            this.comentario = comentario;
        }

        //METODO ABSTRATO
        public abstract void ListaInformacoes();
    }
    //SUBCLASSE

    public static class Disco extends Item {
        //atributos

        public String nomeArtista;
        public int quantidadeFaixas;
        public String midia;
        public String informacoes;

        //CONSTRUTOOES
        public Disco() {
        }

        public Disco(String titulo,
                int anolancamento,
                String comentario,
                String nomeArtista,
                int quantidadeFaixas,
                String midia) {
            this.titulo = titulo;
            this.anolancamento = anolancamento;
            this.comentario = comentario;
            this.nomeArtista = nomeArtista;
            this.quantidadeFaixas = quantidadeFaixas;
            this.midia = midia;
        }
        //GETS E SETS

        public String getNomeArtista() {
            return this.nomeArtista;
        }

        public void setNomeArtista(String NomeArtista) {
            this.nomeArtista = NomeArtista;
        }

        public int getQuantidadeFaixas() {
            return this.quantidadeFaixas;
        }

        public void setQuantidadeFaixas(int quantidadeFaixas) {
            this.quantidadeFaixas = quantidadeFaixas;
        }

        public String getMidia() {
            return this.midia;
        }

        public void setMidia(String midia) {
            this.midia = midia;
        }

        //IMPLEMENTAÇÃO DO METODO ABSTRATO
        @Override
        public void ListaInformacoes() {
            System.out.println("Titulo: " + getTitulo());
            System.out.println("Ano de Lançamento: " + getAnolancamento());
            System.out.println("Comentario: " + getComentario());
            System.out.println("Nome do Artista: " + getNomeArtista());
            System.out.println("Quantidade de Faixas: " + getQuantidadeFaixas());
            System.out.println("Midia: " + getMidia());
            System.out.println("");
        }

    }

    public static class Filme extends Item {

        //ATRIBUTOS
        private String nomeDiretor;
        private int duracao;
        private String genero;

        //CONSTRUTORES
        public Filme() {

        }

        public Filme(String titulo,
                int anolancamento,
                String comentario,
                String nomeDiretor,
                int duracao,
                String genero) {
            this.titulo = titulo;
            this.anolancamento = anolancamento;
            this.comentario = comentario;
            this.nomeDiretor = nomeDiretor;
            this.duracao = duracao;
            this.genero = genero;
        }

        //GETS E SETS
        public String getNomeDiretor() {
            return nomeDiretor;
        }

        public void setNomeDiretor(String nomeDiretor) {
            this.nomeDiretor = nomeDiretor;
        }

        public int getDuracao() {
            return duracao;
        }

        public void setDuracao(int duracao) {
            this.duracao = duracao;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        @Override
        public void ListaInformacoes() {
            System.out.println("Titulo: " + getTitulo());
            System.out.println("Ano de Lançamento: " + getAnolancamento());
            System.out.println("Comentario: " + getComentario());
            System.out.println("Nome do Diretor: " + getNomeDiretor());
            System.out.println("Duração: " + getDuracao() + " min");
            System.out.println("Genero: " + getGenero());
            System.out.println("");
        }

    }

    public static class Locadora {

        Disco[] arrayd;

        Filme[] arrayf;

        int indiceD;
        int indiceF;

        public Locadora() {
            indiceD = 0;
            indiceF = 0;
            arrayd = new Disco[2];
            arrayf = new Filme[2];

        }

        public void novoDisco(Disco discoEntrada, int indiceD) {
            this.indiceD = indiceD;
            arrayd[this.indiceD] = discoEntrada;

        }

        public void novoFilme(Filme filmeEntrada, int indiceF) {
            this.indiceF = indiceF;
            arrayf[this.indiceF] = filmeEntrada;
        }

        public void listarDiscos() {
            for (int i = 0; i < arrayd.length; i++) {
                System.out.println("Informações do Disco: " + (i + 1));
                System.out.println("-----------------------------------------");
                Disco discox = arrayd[i];
                discox.ListaInformacoes();
            }
        }

        public void listarFilmes() {
            for (int i = 0; i < arrayf.length; i++) {
                System.out.println("Informações do Filme: " + (i + 1));
                System.out.println("-----------------------------------------");
                Filme filmex = arrayf[i];
                filmex.ListaInformacoes();
            }

        }

    }
}

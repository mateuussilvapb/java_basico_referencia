package solid.lsp.respeito;

/*
 * A separação em interfaces 'Passaro' e 'PassaroQueVoa' ajuda a respeitar
 * o Princípio da Substituição de Liskov (LSP). Isso permite que pássaros que voam
 * e que não voam sejam implementados corretamente, sem violar o princípio.
 *
 * A interface 'Passaro' define comportamentos gerais que todos os pássaros têm,
 * como comer, enquanto a interface 'PassaroQueVoa' estende 'Passaro' para incluir
 * o comportamento de voar.
 *
 * Essa abordagem possibilita que classes como 'Avestruz' (um pássaro que não voa)
 * implementem 'Passaro', e classes como 'Pardal' (um pássaro que voa) implementem
 * 'PassaroQueVoa'. Assim, garantimos que as subclasses possam substituir suas
 * superclasses sem problemas, respeitando o LSP.
 */

public interface PassaroQueVoa extends Passaro {
    void fly();
}

#/usr/bin/python3
# 
from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier
from sklearn.metrics import accuracy_score

# Criando o conjunto de dados de frutas
fruits = [
    {'cor': 'vermelha', 'tamanho': 'pequeno', 'textura': 'lisa', 'tipo': 'maçã'},
    {'cor': 'verde', 'tamanho': 'pequeno', 'textura': 'lisa', 'tipo': 'maçã'},
    {'cor': 'vermelha', 'tamanho': 'grande', 'textura': 'áspera', 'tipo': 'laranja'},
    {'cor': 'laranja', 'tamanho': 'grande', 'textura': 'áspera', 'tipo': 'laranja'},
    {'cor': 'amarela', 'tamanho': 'pequeno', 'textura': 'lisa', 'tipo': 'banana'},
]

# Convertendo características categóricas em valores numéricos
for fruit in fruits:
    fruit['cor'] = {'vermelha': 0, 'verde': 1, 'laranja': 2, 'amarela': 3}[fruit['cor']]
    fruit['tamanho'] = {'pequeno': 0, 'grande': 1}[fruit['tamanho']]
    fruit['textura'] = {'lisa': 0, 'áspera': 1}[fruit['textura']]
    fruit['tipo'] = {'maçã': 0, 'laranja': 1, 'banana': 2}[fruit['tipo']]

# Separando características (X) e rótulos (y)
X = [[fruit['cor'], fruit['tamanho'], fruit['textura']] for fruit in fruits]
y = [fruit['tipo'] for fruit in fruits]

# Dividindo os dados em treinamento e teste
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

# Criando e treinando o modelo
model = DecisionTreeClassifier()
model.fit(X_train, y_train)

# Fazendo previsões
y_pred = model.predict(X_test)

# Calculando a precisão do modelo
accuracy = accuracy_score(y_test, y_pred)
print("Precisão do modelo:", accuracy)

from sklearn.metrics import classification_report

# ...

# Calculando o classification report
report = classification_report(y_test, y_pred)

# Imprimindo o classification report
print(report)

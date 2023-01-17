//C++ program for representation of "unweighted directed" graph in adjacency form using vector
#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main(){
    int n,m;
    cin >> n >> m;
    //graph in adj list form
    vector<int> adj[n+1];
    for(int i=0; i<m;i++){
        int u,v;
        cin >> u >> v;
        adj[u].push_back(v);
2    }
    for(int i=0;i<=n;i++){
        cout<<endl<<i<<" : ";
        for (int j=0; j<adj[i].size(); j++){
           cout<<" "<<adj[i][j];
        }
    }
    return 0;
}